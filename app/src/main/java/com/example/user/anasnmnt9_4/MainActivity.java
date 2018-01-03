package com.example.user.anasnmnt9_4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
//here i have created main class
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//extends is for extending a class. implements is for implementing an interface
//AppCompatActivity is a parent class
    // ListView is a view which groups several items and display them in vertical scrollable list. The list items are automatically
    // inserted to the list using an Adapter that pulls content from a source such as an array or database.
//The Adapter provides access to the data items. The Adapter is also responsible for making a View for each item in the data set.


    //RelativeLayout is a view group that displays child views in relative positions.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by the subclasses
        // in other package or any class within the package of the protected members class.
        //void is a Java keyword.  Used at method declaration and definition to specify that the method does not return any type,
        // the method returns void.
        //onCreate Called when the activity is first created. This is where you should do all of your normal static set up: create views,
        // bind data to lists, etc. This method also provides you with a Bundle containing the activity's previously frozen state,
        // if there was one.Always followed by onStart().
        //Bundle is most often used for passing data through various Activities.
// This callback is called only when there is a saved instance previously saved using onSaveInstanceState().
// We restore some state in onCreate() while we can optionally restore other state here, possibly usable after onStart() has
// completed.The savedInstanceState Bundle is same as the one used in onCreate().

        super.onCreate(savedInstanceState);
        // call the super class onCreate to complete the creation of activity like the view hierarchy
        setContentView(R.layout.activity_main);
        //R means Resource
        //layout means design
        //  main is the xml you have created under res->layout->main.xml
        //  Whenever you want to change your current Look of an Activity or when you move from one Activity to another .
        // The other Activity must have a design to show . So we call this method in onCreate and this is the second statement to set
        // the design
        //A user interface element that displays text to the user.
        // View IDs need not be unique throughout the tree, but it is good practice to ensure that they are at least unique within the
        //part of the tree you are searching of list view
        TextView tv = (TextView) findViewById(R.id.textView);
        this.registerForContextMenu(tv);
        //Registers a context menu to be shown for the given view (multiple views can show the context menu).
    }

    //overriding the onCreateContextMenu
    //Android context menu appears when user press long click on the element. It is also known as floating menu.
    //Called when the context menu for this view is being built.
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

            getMenuInflater().inflate(R.menu.menu, menu);
            menu.setHeaderTitle("context menu");

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int selectedItemId = item.getItemId();
        // to the Main layout from xml file

        switch (selectedItemId) {
//one of the action will be selected
            // //A toast is a view containing a quick little message for the user. The toast class helps you create and show those.
            //Make a standard toast that just contains a text view with the text from a resource.
            //Context: The context to use. Usually your Application or Activity object.
            //text:The text to show. Can be formatted text.
            //int: How long to display the message. Either LENGTH_SHORT or LENGTH_LONG
            //LENGTH_SHORT :Show the view or text notification for a short period of time
            //show():Show the view for the specified duration.

            case R.id.Action1:
                Toast.makeText(getApplicationContext(), "Action 1  selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.Action2:
                Toast.makeText(getApplicationContext(), "Action 2 selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.Action3:
                Toast.makeText(getApplicationContext(), "Action 3 selected", Toast.LENGTH_LONG).show();
                break;


        }

        return true;
        //return the item
    }
}
