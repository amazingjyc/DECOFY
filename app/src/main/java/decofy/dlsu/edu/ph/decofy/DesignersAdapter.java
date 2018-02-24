package decofy.dlsu.edu.ph.decofy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jarre on 24/02/2018.
 */

public class DesignersAdapter extends RecyclerView.Adapter<DesignersAdapter.ViewHolder> {

    private ArrayList<Designer> mDataset;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView heading;
        public TextView shortDescription;
        public View container;

        public ViewHolder(View v) {
            super(v);
            heading = (TextView) itemView.findViewById(R.id.heading);
            shortDescription = (TextView) itemView.findViewById(R.id.short_description);
            container = (View) itemView.findViewById(R.id.container);
        }
    }

    public DesignersAdapter(ArrayList<Designer> myDataset, Context context) {
        this.mDataset = myDataset;
        this.context = context;
    }

    @Override
    public DesignersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        return new DesignersAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(DesignersAdapter.ViewHolder holder, int position) {

        final Designer designer = mDataset.get(position);

        if(designer != null) {
            String id = designer.getId()+"";
            holder.heading.setText(designer.getName());
            holder.shortDescription.setText("Contact No.:"+designer.getContactNo()+" Email:"+designer.getEmail());
            holder.container.setTag(id);
        }

        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
