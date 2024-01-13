package namntdev.software.chatapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import namntdev.software.chatapp.R;
import namntdev.software.chatapp.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {
    private ActivitySignUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setLiteners();
    }

    private void setLiteners() {
        binding.textSignIn.setOnClickListener(view -> onBackPressed());
    }
}