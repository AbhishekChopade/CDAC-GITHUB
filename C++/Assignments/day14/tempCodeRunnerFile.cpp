#include <iostream>
// #include <string>

// // Template function to swap two values of the same type
// template <typename T>
// void swapValues(T& a, T& b) {
//     T temp = a;
//     a = b;
//     b = temp;
// }

// // Specialization for swapping two strings
// template <>
// void swapValues(std::string& a, std::string& b) {
//     std::swap(a, b);
// }

// int main() {
//     int x = 5, y = 10;
//     std::string str1 = "Hello", str2 = "World";

//     // Swap integers
//     swapValues(x, y);
//     std::cout << "Swapped integers: x = " << x << ", y = " << y << std::endl;

//     // Swap strings
//     swapValues(str1, str2);
//     std::cout << "Swapped strings: str1 = " << str1 << ", str2 = " << str2 << std::endl;

//     return 0;
// }