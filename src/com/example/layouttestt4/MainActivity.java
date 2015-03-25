package com.example.layouttestt4;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView myListView = (ListView) findViewById(R.id.my_main_listview);

		UserAdapter myUserAdapter=new UserAdapter(getApplicationContext(), createDummyUserModels());
		//UserAdapter myUserAdapter=new UserAdapter(getApplicationContext(), userlist);

		myListView.setAdapter(myUserAdapter);

	}

	public UserModel[] createDummyUserModels(){

		String[] names={"anand","senthil","vipin","praveen","kiran","anoop","vipin","praveen","kiran","anoop"};
		String[] emails={"anandab@gmail.com","senthiljs@gmail.com","vipinkamara@gmail.com","praveen@gmail.com","kiran@gmail.com", "anoop@gmail.com","vipinkamara@gmail.com","praveen@gmail.com","kiran@gmail.com", "anoop@gmail.com"};
		UserModel[] userlist=new UserModel[names.length];
		for (int i = 0; i < emails.length; i++) {
			userlist[i]=new UserModel(names[i],emails[i]);
		}
		return userlist;
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		switch (item.getItemId()) {
		case R.id.action_settings:
			Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_LONG).show();
			//startActivity(new Intent(getApplicationContext(),SecMainActivity.class));
			break;
		case R.id.action_settings1:
			Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_LONG).show();
			break;
		case R.id.action_settings2:
			Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_LONG).show();
			//startActivity(new Intent(getApplicationContext(),ThirdMainActivity.class));
			break;


		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}
