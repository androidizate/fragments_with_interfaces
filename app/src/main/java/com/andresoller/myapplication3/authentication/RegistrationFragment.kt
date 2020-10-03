package com.andresoller.myapplication3.authentication

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.andresoller.myapplication3.R
import kotlinx.android.synthetic.main.fragment_registration.*

class RegistrationFragment : Fragment() {

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
        return inflater.inflate(R.layout.fragment_registration, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_register.setOnClickListener {
            listener.onNavigateToHome()
        }

        bt_login.setOnClickListener {
            listener.onNavigateToLogin()
        }
    }
}