boolean consecutiveBit(int n) {
    int i=0;
    while (n>0){
        i=n%2==1?i+1:0;
        n/=2;
        if (i==2) return true;
    }
    return false;
}

