class Solution {
    public double angleClock(int hour, int minutes) {
        double hrval=0;
        double min=0;
        if(hour==12){
            hour=0;
        }
            hrval=(hour*30)+(minutes*0.5);
            min=6*minutes;

            double dif=Math.abs(hrval-min);
            if(dif>180){
                 return 360-dif;
            }
            return dif;
    }
}