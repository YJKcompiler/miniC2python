int sum(int a, int b) {
    return a+b;
}

int sub(int a, int b) {
    return sum(a, -b);
}
void main() {
    int a = 3;
    float b = 5.3;
    int c = 0;
    int numArr[10];
    int a[3] = {1,2,3};
    char test[10] = "cat";
    char test2[10] = "and dog";
    char test3[20];
     test3 = strcat(test,test2);
    numArr[1]=23;
    while(b<10) {
        ++b;
        --b;
        b= -b;
        if(a or c) {
            print(a);
            a = sum(a, -1);
            c = sub(b, 2);

        }
    }
    return;
}