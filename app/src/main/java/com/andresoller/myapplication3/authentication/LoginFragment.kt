package com.andresoller.myapplication3.authentication

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.andresoller.myapplication3.R
import kotlinx.android.synthetic.main.fragment_login.*
import java.io.FileReader

class LoginFragment : Fragment() {

    lateinit var listener: FragmentActionsListener

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as FragmentActionsListener
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_register.setOnClickListener {
            listener.onNavigateToRegister()
        }

        bt_login.setOnClickListener {
            listener.onNavigateToHome()
        }
    }
}