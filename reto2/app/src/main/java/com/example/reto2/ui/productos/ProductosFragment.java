package com.example.reto2.ui.productos;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.reto2.Form_add_Activity;
import com.example.reto2.R;
import com.example.reto2.databinding.FragmentProductosBinding;
import com.example.reto2.ui.ajustes.AjustesFragment;

public class ProductosFragment extends Fragment {


    private FragmentProductosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentProductosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_agregar:
                Intent intent = new Intent(getContext(), Form_add_Activity.class);
                intent.putExtra("name","Productos");
                getActivity().startActivity(intent);
                //Toast.makeText(getContext(),"Agregar",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Intent intent2 = new Intent(getContext(), AjustesFragment.class);
                intent2.putExtra("name","Productos");
                getActivity().startActivity(intent2);
                //Toast.makeText(getContext(),"Agregar",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}