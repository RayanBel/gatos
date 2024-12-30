import java.lang.Math;

public class PeacefulYard {
    public static boolean peacefulYard(String[] yard, int minDistance) {
        int posCats[][]=new int[][]{{-1,-1},{-1,-1},{-1,-1}};
      
        for(int i=0; i<yard.length;i++)
            for(int j=0; j<yard[i].length();j++)
                switch(yard[i].charAt(j)){
                    case 'L':
                        posCats[0]=new int[]{j,i};
                        break;
                    case 'M':
                        posCats[1]=new int[]{j,i};
                        break;
                    case 'R':
                        posCats[2]=new int[]{j,i};
                        break;
                }
        
        for(int i=0;i<posCats.length;i++){
            if(posCats[i][0]==-1)
                continue;
            for(int j=i+1; j<posCats.length;j++){
                if(posCats[j][0]==-1)
                    continue;
                if(Math.sqrt(
                    Math.abs(posCats[i][0]-posCats[j][0])*Math.abs(posCats[i][0]-posCats[j][0])
                    +Math.abs(posCats[i][1]-posCats[j][1])*Math.abs(posCats[i][1]-posCats[j][1]))
                    <minDistance)
                        return false;
            }
        }
      
        return true;
    }
}
