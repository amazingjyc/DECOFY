package decofy.dlsu.edu.ph.decofy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class DesignersFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Designer> designers = new ArrayList<Designer>();

    public DesignersFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        designers.add(new Designer("Jarrell Chua", "09177956550", "jarrell_chua@dlsu.edu.ph", 1));
        designers.add(new Designer("Jarrell Chua", "09177956550", "jarrell_chua@dlsu.edu.ph", 2));
        designers.add(new Designer("Jarrell Chua", "09177956550", "jarrell_chua@dlsu.edu.ph", 3));
        designers.add(new Designer("Jarrell Chua", "09177956550", "jarrell_chua@dlsu.edu.ph", 4));
        designers.add(new Designer("Jarrell Chua", "09177956550", "jarrell_chua@dlsu.edu.ph", 5));
        designers.add(new Designer("Jarrell Chua", "09177956550", "jarrell_chua@dlsu.edu.ph", 6));
        designers.add(new Designer("Jarrell Chua", "09177956550", "jarrell_chua@dlsu.edu.ph", 7));
    }

    @Override
    public void onResume() {
        super.onResume();

        mAdapter = new DesignersAdapter(designers,getActivity());
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