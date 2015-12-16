package mobilebackend

class ProductController {

    static scaffold = true

    // def index() { }

    // def list = {}

    def list = {
        def products = Product.findAllByStatus("Available", [sort: "name", order : "asc"])
        def tags = Tag.list(sort: "name", order : "asc")

        return [products : products, tags : tags ]

    }
}
