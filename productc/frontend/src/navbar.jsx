import { useState } from "react";

const Navbar = () => {
    const [searchOpen, setSearchOpen] = useState(false);

    return (
        <nav className="navbar navbar-expand-lg bg-dark navbar-dark shadow-sm">
            <div className="container">

                <div className="d-flex align-items-center justify-content-between w-100">

                    {/* Logo */}
                    <a
                        href="#"
                        className="navbar-brand d-flex align-items-center gap-2 mb-0"
                    >
                        <span className="brand-icon">🛒</span>
                        <span>SHIYAPT</span>
                    </a>

                    {/* Links */}
                    <div className="d-none d-lg-flex align-items-center gap-4">
                        <a href="#" className="nav-link text-white">
                            Home
                        </a>

                        <a href="#" className="nav-link text-white">
                            Products
                        </a>

                        <a href="#" className="nav-link text-white">
                            Categories
                        </a>

                        <a href="#" className="nav-link text-white">
                            About
                        </a>
                    </div>

                    {/* Right side */}
                    <div className="d-flex align-items-center gap-2">

                        <button
                            className="btn btn-outline-light d-flex align-items-center gap-2"
                            type="button"
                        >
                            <span>🛒</span>
                            <span>Cart</span>
                        </button>

                        <button
                            className="btn btn-outline-light d-lg-none"
                            type="button"
                            onClick={() => setSearchOpen(!searchOpen)}
                        >
                            ☰
                        </button>

                    </div>

                </div>

            </div>
        </nav>
    );
};

export default Navbar;