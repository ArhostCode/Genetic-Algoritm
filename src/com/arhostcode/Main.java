package com.arhostcode;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Visualisation v = new Visualisation();
        v.setVisible(true);
        GenCore g = new GenCore(100,100,v);
        g.run();
        //g.runWithBrains(new double[]{2.290633863868992, 1.4704481416142894, -0.019605765587492385, -1.0268582836622047, 0.028617938646005925, 0.9928005778499749, 1.245488921301507, 0.11753372621321745, 0.9954102983287196, 0.8078705577439367, 0.3242712826571461, 0.8602177507952904, 0.24691671759159117, -0.4409638847669317, 2.2179833257208843, -0.7482096270067258, 3.0466017056554193, 0.5790525764815975, -0.4576469860934189, 0.24328871083436088 });
    }
}