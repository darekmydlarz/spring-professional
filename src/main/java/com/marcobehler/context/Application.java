package com.marcobehler.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.marcobehler.service.InvoiceService;
import com.marcobehler.service.UserService;

public class Application {

    public static final UserService userService = new UserService();
    public static final InvoiceService invoiceService = new InvoiceService(userService);
    public static final ObjectMapper objectMapper = new ObjectMapper();
}
