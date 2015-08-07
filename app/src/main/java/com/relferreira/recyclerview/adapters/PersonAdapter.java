package com.relferreira.recyclerview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.relferreira.recyclerview.R;
import com.relferreira.recyclerview.models.Person;
import java.util.List;


public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private List<Person> mList;

    public PersonAdapter(List<Person> list){
        this.mList = list;
    }
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_person, viewGroup, false);
        return new PersonViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder viewHolder, int i) {
        Person person = mList.get(i);
        viewHolder.viewLastName.setText(person.getLastName());
        viewHolder.viewName.setText(person.getName());
        viewHolder.viewAge.setText(String.valueOf(person.getAge()));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    protected static class PersonViewHolder  extends RecyclerView.ViewHolder{

        protected TextView viewName;
        protected TextView viewLastName;
        protected TextView viewAge;

        public PersonViewHolder(View itemView) {
            super(itemView);
            viewName = (TextView) itemView.findViewById(R.id.name);
            viewLastName = (TextView) itemView.findViewById(R.id.last_name);
            viewAge = (TextView) itemView.findViewById(R.id.age);
        }
    }
}
