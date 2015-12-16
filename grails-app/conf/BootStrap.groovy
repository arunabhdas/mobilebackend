import mobilebackend.Product
import mobilebackend.Tag

class BootStrap {

    def init = { servletContext ->

    }
    def init = { servletContext ->

        def spaceTag = new Tag(name: 'Space').save()
        def terrestrialTag = new Tag(name: 'Terrestrial').save()

        def spaceRobot = new Product(name: 'Space Robot', description: 'Space robot with SpaceX engine ', status: "Available").save()


        def terrestrialRobot = new Product(name: 'Terrestrial Robot', description: 'Terrestrial robot with Tesla motor', status: "Available").save()



    }
    def destroy = {
    }
}
