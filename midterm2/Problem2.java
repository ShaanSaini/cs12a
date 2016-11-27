static int[] concatenate(int[] A, int[] B) {
    int aLength = a.length;
    int bLength = b.length;
    int[] c = new int[aLength + bLength];
    System.arraycopy(a, 0, c, 0, aLen);
    System.arraycopy(b, 0, c, aLen, bLen);
    return c;
}
