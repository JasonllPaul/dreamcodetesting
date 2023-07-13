package category;

import java.util.ArrayList;

public class HomeAppliances implements Category {

    protected ArrayList<String> keywords;
    private int level = 1;

    public HomeAppliances() {
        this.keywords = new ArrayList<>();
        this.keywords.add("home appliances");
        this.keywords.add("home");
        this.keywords.add("appliances");

    }


    /**
     * This method allows to print all items from a list
     */
    @Override
    public void getKeywords() {
        for (int i = 0; i < this.keywords.size(); i++) {
            System.out.println(this.keywords.get(i));
        }
    }

    public int getLevel(){
        return this.level;
    }
}
