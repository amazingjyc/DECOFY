package decofy.dlsu.edu.ph.decofy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ConversationsFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Message> messages = new ArrayList<Message>();

    public ConversationsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        messages.add(new Message(1,"Jarrell Chua","Design Plan 1", "Sample Message","02-24-2018"));
        messages.add(new Message(2,"Jarrell Chua","Design Plan 2", "Sample Message","02-25-2018"));
        messages.add(new Message(3,"Jarrell Chua","Design Plan 3", "Sample Message","02-26-2018"));
        messages.add(new Message(4,"Jarrell Chua","Design Plan 4", "Sample Message","02-27-2018"));
        messages.add(new Message(5,"Jarrell Chua","Design Plan 5", "Sample Message","02-28-2018"));
        messages.add(new Message(6,"Jarrell Chua","Design Plan 6", "Sample Message","03-01-2018"));
        messages.add(new Message(7,"Jarrell Chua","Design Plan 7", "Sample Message","03-02-2018"));
        messages.add(new Message(8,"Jarrell Chua","Design Plan 8", "Sample Message","03-03-2018"));
    }

    @Override
    public void onResume() {
        super.onResume();

        mAdapter = new MessagesAdapter(messages,getActivity());
        mAdapter.notifyDataSetChanged();
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_conversations, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        return rootView;
    }
}
