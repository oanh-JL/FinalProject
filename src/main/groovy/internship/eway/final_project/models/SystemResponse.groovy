package internship.eway.final_project.models

class SystemResponse {
    int code
    String title
    String message

    SystemResponse() {
    }

    SystemResponse(int code, String title, String message) {
        this.code = code
        this.title = title
        this.message = message
    }
}
