module org.example.application {
    requires org.example.service;
    uses org.example.service.api.Service;
    uses org.example.service.api.ServiceFactory;
}
