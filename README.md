```c++
#include <iostream>
#include <vector>

class SoftwareEngineer {
public:
    SoftwareEngineer() {
        pronouns = "He/Him";
        name = "Davide";
        role = "Computer Science Student";
        language_spoken = {"it_IT", "en_US"};
    }

    void say_hi() {
        std::cout << "Thanks for dropping by, hope you find some of my work interesting." << std::endl;
    }

private:
    std::string pronouns;
    std::string name;
    std::string role;
    std::vector<std::string> language_spoken;
};

int main() {
    SoftwareEngineer me;
    me.say_hi();

    return 0;
}
```
