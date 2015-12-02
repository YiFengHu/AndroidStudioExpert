package com.example.androidstudioexpert;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import java.util.List;


/**
 * Created by Roder Hu on 2015/12/1.
 */
public class EditorDemo extends Activity{

    //參考 Android Studio Expert (Android Dev summit 2015)
    //http://www.jianshu.com/p/c873441be31e




    public void basicShortCuts(){
        //Search full area: double shift
        //Search file: ctrl + shift + N (command + O)
        // ex. MainActivity:$line numbers$

        //Recent files : ctrl + E (command + E)
        //Direct go to file： ctrl + Tab

        //Search Action Name: ctrl + shift + A
        //Intention Actions: alt + enter
        //Generate Actions:  alt + insert ( command + N )

        //Project panel : alt + 1
        //Panel: alt + $number$
    }








    public void completionHint(Context context){
        //ctrl + space
        //ctrl + shift + space

//        Drawable drawable = ;
    }








    public boolean completionSelect(String first, String second){
        //tab
        return first.contains(second);
    }









    public String completionNewVariable(String first, String second) {
        //new Constructor().var
        return new String();
    }








    public String selection(String string){
        //action: extend selection
        //Extend: ctrl + W (alt + up)
        //alt + down
        return string.length() > 0 ? string.substring(0, string.length() -5)
                : string;
    }








    public static class InitialField{

        //alt + enter : Show Intention Action
        //Bind parameters to fields
        InitialField(int first, int second, int third){

        }
    }











    public void instanceCheck(Object obj){
        if(obj instanceof Context){
            //Cast objects

            //Intention Actions: alt + enter

        }
    }








    public int suppressWarnings(){
        //alt + enter -> suppress warnings
        int value = 0;
        return value;
    }









    public void forLoops(List<String> list){
        //fori
        //foreach
//        for (int i = 0; i < ; i++) { ... }
    }












    public String liveTemplate(int first, String second, float third){
        //logi, logt, logm, logr

        String result = "";
        return result;
    }









    public void filterSearch(){
        //In General Action
        //In Popup Menus - new file(Win: alt + insert, Mac: command + N)
        //In Project Views
    }














    public void scrtuctralSearchAndReplace(View view, Drawable drawable) {
        //search actions : Replace structurally

        //<$tag$ $attribute$=" $value$ "/> - resource files
        //$Instance$.$MethodCall$($Arguments$) - methods

        //https://www.jetbrains.com/idea/help/structural-search-and-replace-examples.html
        view.setBackgroundDrawable(drawable);

    }











    public void designTimeAttribute(){
        //Design attribute
        //Go to main_activity.xml

        //http://tools.android.com/tech-docs/tools-attributes
    }

}
