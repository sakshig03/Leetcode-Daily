class Solution {
    public double[] convertTemperature(double celsius) {
        double ans[]=new double[2];
        double kelvin=celsius+273.15;
        double Fahrenheit=celsius*1.80+32.00;
        ans[0]=kelvin;
        ans[1]=Fahrenheit;
        return ans;
        
    }
}