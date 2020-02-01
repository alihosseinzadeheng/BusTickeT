package ir.mctab.project.shared;

import ir.mctab.project.entities.Customer;

public class AuthenticationService {
    private Customer loginCustomer;

    private static AuthenticationService authenticationService = null;
    public static AuthenticationService getInstance() {
        if (authenticationService == null) {
            authenticationService = new AuthenticationService();
        }
        return authenticationService;
    }

    private AuthenticationService() {

    }

    public void setLoginCustomer(Customer customer) {
        this.loginCustomer = customer;
    }

    public Customer getLoginCustomer() {
        return loginCustomer;
    }
}
