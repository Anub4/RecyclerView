package np.com.softwarica.lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import np.com.softwarica.lab.contactsadapter.ContactsAdapter;
import np.com.softwarica.lab.model.Contacts;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv1= findViewById(R.id.rv1);

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Saugat Malla", "9884882885",R.drawable.saugat));
        contactsList.add(new Contacts("Rajesh Hamal", "9884862885",R.drawable.rajesh));
        contactsList.add(new Contacts(" Bhuwan KC", "9884882785",R.drawable.bhuwan));
        contactsList.add(new Contacts("Dayahang Rai", "9884882085",R.drawable.dahayang));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        rv1.setAdapter(contactsAdapter);
        rv1.setLayoutManager(new LinearLayoutManager(this));

    }
}
