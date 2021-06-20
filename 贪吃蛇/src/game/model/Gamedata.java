package game.model;

public class Gamedata {
    private boolean fail=false;
    private int count;
    private boolean star=false;


    public void init(){
        count=0;
        star=false;
        fail=false;
    }

    public void changeFail(){
        fail=!fail;
    }
    public  void changeStar(){star=!star;}
    public int getCount(){
        return count;
    }
    public void addCount(){
        count++;
    }
    public boolean isFail(){
        return fail;
    }
    public boolean isStar(){return star;}
}
