const Footer = () => {
    return (
        <footer className="bg-dark text-white mt-5">

            {/* Main Footer */}
            <div className="container py-5">

                <div className="row g-4">

                    {/* About */}
                    <div className="col-12 col-md-6 col-lg-4">

                        <h4 className="fw-bold mb-3">
                            🛒 SHIYAPT
                        </h4>

                        <p className="text-secondary mb-0">
                            Your one-stop destination for electronics,
                            clothing, home and kitchen products.
                        </p>

                        <div className="mt-4">
                            <span className="badge bg-primary me-2">
                                Quality Products
                            </span>

                            <span className="badge bg-success">
                                Fast Delivery
                            </span>
                        </div>

                    </div>


                    {/* Quick Links */}
                    <div className="col-6 col-md-3 col-lg-2">

                        <h5 className="fw-bold mb-3">
                            Quick Links
                        </h5>

                        <ul className="list-unstyled">

                            <li className="mb-2">
                                <a
                                    href="#"
                                    className="text-secondary text-decoration-none"
                                >
                                    Home
                                </a>
                            </li>

                            <li className="mb-2">
                                <a
                                    href="#"
                                    className="text-secondary text-decoration-none"
                                >
                                    Products
                                </a>
                            </li>

                            <li className="mb-2">
                                <a
                                    href="#"
                                    className="text-secondary text-decoration-none"
                                >
                                    Categories
                                </a>
                            </li>

                            <li>
                                <a
                                    href="#"
                                    className="text-secondary text-decoration-none"
                                >
                                    About Us
                                </a>
                            </li>

                        </ul>

                    </div>


                    {/* Categories */}
                    <div className="col-6 col-md-3 col-lg-2">

                        <h5 className="fw-bold mb-3">
                            Categories
                        </h5>

                        <ul className="list-unstyled">

                            <li className="mb-2">
                                <a
                                    href="#"
                                    className="text-secondary text-decoration-none"
                                >
                                    Electronics
                                </a>
                            </li>

                            <li className="mb-2">
                                <a
                                    href="#"
                                    className="text-secondary text-decoration-none"
                                >
                                    Clothing
                                </a>
                            </li>

                            <li>
                                <a
                                    href="#"
                                    className="text-secondary text-decoration-none"
                                >
                                    Home & Kitchen
                                </a>
                            </li>

                        </ul>

                    </div>


                    {/* Contact */}
                    <div className="col-12 col-md-6 col-lg-4">

                        <h5 className="fw-bold mb-3">
                            Contact Us
                        </h5>

                        <ul className="list-unstyled">

                            <li className="mb-3">
                                <span className="me-2">📧</span>
                                <span className="text-secondary">
                                    support@gmail.com
                                </span>
                            </li>

                            <li className="mb-3">
                                <span className="me-2">📞</span>
                               
                                <span className="text-secondary">
                                    +91 9631202222
                                </span>
                              
                            </li>

                            <li>
                                <span className="me-2">📍</span>
                                <span className="text-secondary">
                                    India
                                </span>
                            </li>

                        </ul>

                    </div>

                </div>

            </div>


            {/* Bottom Footer */}
            <div className="border-top border-secondary">

                <div className="container py-3">

                    <div className="row align-items-center">

                        <div className="col-md-6 text-center text-md-start">

                            <p className="mb-0 text-secondary small">
                                © 2026 ShopZone. All rights reserved.
                            </p>

                        </div>

                        <div className="col-md-6 text-center text-md-end mt-2 mt-md-0">

                            <span className="text-secondary small me-3">
                                Privacy Policy
                            </span>

                            <span className="text-secondary small">
                                Terms & Conditions
                            </span>

                        </div>

                    </div>

                </div>

            </div>

        </footer>
    );
};

export default Footer;
