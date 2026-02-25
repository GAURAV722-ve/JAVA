class Rectangle {
    int width, length;

    void getdata(int x, int y) { // parameters stored in stack
        width = x;
        length = y;
    }

    int area() {
        int a = length * width;
        return a;
    }
}