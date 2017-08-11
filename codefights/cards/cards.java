String cards(int n) {
    
    char[] a = {'2','3','4','5','6','7','8','9','0','J','Q','K','A'};
    char[] b = {'C','D','H','S'};
    return a[n%13]+""+b[n/13)];
    
}

