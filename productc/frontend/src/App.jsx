import { useEffect, useState } from 'react'
import './App.css'
import ProductList from './productList'
import Category_filter from './category_filter'
import Navbar from "./navbar"
import Footer from "./footer"
import 'bootstrap/dist/css/bootstrap.min.css'

function App() {
    const [products, setProducts] = useState([]);
    const [categories, setcategories] = useState([]);
    const [selectedcategory, setSelectedcatagory] = useState(null);
    const [searchTerm, setSearchTerm] = useState("");

    useEffect(() => {
        fetch('http://localhost:8080/api/product')
            .then(response => response.json())
            .then(data => setProducts(data))
            .catch(error => console.error(error));

        fetch('http://localhost:8080/api/category')
            .then(response => response.json())
            .then(data => setcategories(data))
            .catch(error => console.error(error));
    }, []);

    const handelsearch = (event) => {
        setSearchTerm(event.target.value);
    };

    const handelcategoryselect = (category_id) => {
        setSelectedcatagory(
            category_id ? Number(category_id) : null
        );
    };

    const filter_products = products.filter(product => {
        return (
            (selectedcategory
                ? product.category.id === selectedcategory
                : true)
            &&
            product.name
                .toLowerCase()
                .includes(searchTerm.toLowerCase())
        );
    });

    return (
        <>
            <Navbar />

            {/* Search & Category Section */}
            <div className="filter-section">
                <div className="container">
                    <div className="filter-wrapper">

                        {/* Category */}
                        <div className="category-box">
                            <Category_filter
                                categories={categories}
                                onSelect={handelcategoryselect}
                            />
                        </div>

                        {/* Search */}
                        <div className="search-box">
                            <input
                                type="text"
                                className="search-input"
                                placeholder="Search for products..."
                                value={searchTerm}
                                onChange={handelsearch}
                            />

                            <button
                                className="search-button"
                                type="button"
                            >
                                🔍
                            </button>
                        </div>

                    </div>
                </div>
            </div>

            {/* Products */}
            <div className="container product-container">

                {filter_products.length > 0 ? (
                    <ProductList products={filter_products} />
                ) : (
                    <div className="no-product">
                        <h5>No products found</h5>
                        <p>Try changing your search or category.</p>
                    </div>
                )}

            </div>

            <Footer />
        </>
    );
}

export default App;