package game.model;

public class Gamedata {
    private boolean fail=false;
    private int count;
    public void init(){
        fail=false;
        count=0;
    }
    public void change(){
        fail=!fail;
    }
    public int getCount(){
        return count;
    }
    public void addCount(){
        count++;
    }
    public boolean isFail(){
        return fail;
    }
}
