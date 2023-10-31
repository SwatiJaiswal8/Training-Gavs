package java1;

import java.util.Arrays;

public class CustomerReport {

    private Customer[] custList;
    private int size;

    public CustomerReport() {
        
        this.custList = new Customer[10];
        this.size = 0;
    }

    public void addCustomer(Customer customer) {
        if (size >= custList.length) {
            resizeArray();
        }
        custList[size] = customer;
        size++;
    }

    private void resizeArray() {
        int newCapacity = custList.length * 2;
        custList = Arrays.copyOf(custList, newCapacity);
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            Customer customer = custList[i];
            System.out.println("Customer No: " + customer.getCustNo());
            System.out.println("Customer Name: " + customer.getCustName());
            System.out.println("Customer Address: " + customer.getCustAddress());
            
        }
    }
}
