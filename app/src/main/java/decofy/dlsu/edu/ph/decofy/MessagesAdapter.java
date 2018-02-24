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

public class MessagesAdapter extends RecyclerView.Adapter<MessagesAdapter.ViewHolder> {

    private ArrayList<Message> mDataset;
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

    public MessagesAdapter(ArrayList<Message> myDataset, Context context) {
        this.mDataset = myDataset;
        this.context = context;
    }

    @Override
    public MessagesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        return new MessagesAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MessagesAdapter.ViewHolder holder, int position) {

        final Message message = mDataset.get(position);

        if(message != null) {
            String id = message.getId()+"";
            holder.heading.setText(message.getAuthor());
            holder.shortDescription.setText(message.getContent());
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
