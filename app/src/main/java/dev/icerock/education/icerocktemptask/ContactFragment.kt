package dev.icerock.education.icerocktemptask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.icerock.education.icerocktemptask.databinding.FragmentContactBinding


class ContactFragment : Fragment() {
    private lateinit var binding: FragmentContactBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentContactBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val firstName = requireArguments().getString("firstName")
        val lastName = requireArguments().getString("lastName")
        val avatar = requireArguments().getInt("avatar")

        binding.personName.text = firstName
        binding.personLastName.text = lastName
        binding.avatarImg.setImageResource(avatar)
    }

}