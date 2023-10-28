public class Robot {
    
    public static final int nord = 0;
    public static final int est = 1;
    public static final int sud = 2;
    public static final int ouest = 3;

    private int ord;
    private int abs;
    private int orientation;

    public Robot(int x, int y, int orientation){

        this.abs = x;
        this.ord = y;
        this.orientation = orientation;

    }

    public Robot(){
        this(0,0, nord);
    }

    public void avancer(){

        switch(orientation){

            case nord : ord++; break;
            case est : abs++; break;
            case sud : ord--; break;
            case ouest : abs--; break;

        }
    }

    public void tourner(){
        orientation = orientation + 1%4;
    }
}
