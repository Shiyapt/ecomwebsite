const ProductList = ({ products }) => {
    return (
        <div className="row g-4">
            {products.map(product => (
                <div
                    className="col-12 col-sm-6 col-md-4 col-lg-3"
                    key={product.id}
                >
                    <div className="card product-card h-100">

                        {/* Image */}
                        <div className="product-image-container">
                            <img
                                src={product.imgurl}
                                alt={product.name}
                                className="product-image"
                            />
                        </div>

                        {/* Product information */}
                        <div className="card-body d-flex flex-column">

                            <h5 className="product-title">
                                {product.name}
                            </h5>

                            <p className="product-description">
                                {product.description}
                            </p>

                            <div className="mt-auto">
                                <p className="product-price">
                                    ₹{product.price}
                                </p>

                                <button className="btn btn-primary w-100">
                                    Add to Cart
                                </button>
                            </div>

                        </div>
                    </div>
                </div>
            ))}
        </div>
    );
};

export default ProductList;