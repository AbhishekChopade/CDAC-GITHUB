// 1. create a class Product, it has a data members (pid, pname, company) and member function 
// calculatePrice() as a virtual which calculate the total product amount,
// then create child class SnackProduct inherit from Product. It has its own data members(price, quantity)and member function displayData()
// store that data in a file and display it from file with calculated price.



#include <iostream>
#include <fstream>
#include <string>

class Product {
public:
    Product(int pid, const std::string& pname, const std::string& company)
        : pid_(pid), pname_(pname), company_(company) {}

    // Virtual function to calculate the total product amount
    virtual double calculatePrice() const {
        // Base class calculates the price as 0.0 by default
        return 0.0;
    }

    int getPid() const {
        return pid_;
    }

    const std::string& getPname() const {
        return pname_;
    }

    const std::string& getCompany() const {
        return company_;
    }

private:
    int pid_;
    std::string pname_;
    std::string company_;
};

class SnackProduct : public Product {
public:
    SnackProduct(int pid, const std::string& pname, const std::string& company, double price, int quantity)
        : Product(pid, pname, company), price_(price), quantity_(quantity) {}

    // Override the calculatePrice() function for SnackProduct
    double calculatePrice() const override {
        return price_ * quantity_;
    }

    double getPrice() const {
        return price_;
    }

    int getQuantity() const {
        return quantity_;
    }

    // Member function to display product data
    // void displayData() const {
    //     std::cout << "Product ID: " << getPid() << std::endl;
    //     std::cout << "Product Name: " << getPname() << std::endl;
    //     std::cout << "Company: " << getCompany() << std::endl;
    //     std::cout << "Price per Unit: $" << getPrice() << std::endl;
    //     std::cout << "Quantity: " << getQuantity() << std::endl;
    //     std::cout << "Total Price: $" << calculatePrice() << std::endl;
    // }

    // Member function to save product data to a file
    void saveToFile(std::ofstream& outFile) const {
        outFile << "Product ID: " << getPid() << std::endl;
        outFile << "Product Name: " << getPname() << std::endl;
        outFile << "Company: " << getCompany() << std::endl;
        outFile << "Price per Unit: $" << getPrice() << std::endl;
        outFile << "Quantity: " << getQuantity() << std::endl;
        outFile << "Total Price: $" << calculatePrice() << std::endl;
    }

private:
    double price_;
    int quantity_;
};

int main() {
    // Create a SnackProduct object
    SnackProduct snack(101, "Chips", "XYZ Snacks Inc.", 1.5, 10);

    // Display product data and calculated price
   // snack.displayData();

    // Store product data in a file
    std::ofstream outFile("product_data.txt");
    if (outFile.is_open()) {
        snack.saveToFile(outFile);
        outFile.close();
        std::cout << "Product data saved to 'product_data.txt'." << std::endl;
    } else {
        std::cerr << "Error: Unable to open the file for writing." << std::endl;
    }

    // Retrieve and display product data from the file
    std::ifstream inFile("product_data.txt");
    if (inFile.is_open()) {
        std::string line;
        while (getline(inFile, line)) {
            std::cout << line<< std::endl;
        }
        inFile.close();
    } else {
        std::cerr << "Error: Unable to open the file for reading." << std::endl;
    }

    return 0;
}