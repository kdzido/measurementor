class BootStrap {
    def grailsApplication
    def updateDataFromSourceService
    def asgardDataService
    def jenkinsDataService

    def init = { servletContext ->
        println("GO TIME!")
        //asgardDataService.getApplications()
        //jenkinsDataService.getBuilds()

        if(grailsApplication.config.runOnStartup == "true") {
            updateDataFromSourceService.getAllData()
        }
    }
    def destroy = {
    }
}