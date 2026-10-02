const Category_filter = ({ categories, onSelect }) => {

    return (
        <select
            className="category-select"
            onChange={(e) => onSelect(e.target.value)}
        >
            <option value="">All Categories</option>

            {categories.map(category => (
                <option
                    key={category.id}
                    value={category.id}
                >
                    {category.name}
                </option>
            ))}
        </select>
    );
};

export default Category_filter;