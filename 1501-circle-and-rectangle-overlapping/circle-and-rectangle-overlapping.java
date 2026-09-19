class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int maxx=Math.max(x1,Math.min(xCenter,x2));
        int maxy=Math.max(y1,Math.min(yCenter,y2));

        int a=xCenter-maxx;
        int b=yCenter-maxy;

        return a*a+b*b<=radius*radius;
    }
}