package com.example.fanpassvfinal.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fanpassvfinal.Usuario
import com.example.fanpassvfinal.databinding.ItemUsuarioBinding

class UsuarioViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemUsuarioBinding.bind(view)

    fun render(
        usuarioModel: Usuario,
        onClickListener: (Usuario) -> Unit,
        onClickDelete: (Int) -> Unit
    ) {
        binding.tvUsuarioName.text = usuarioModel.usuario
        binding.tvRealName.text = usuarioModel.realName
        binding.tvPublisher.text = usuarioModel.publisher
        Glide.with(binding.ivUsuario.context).load(usuarioModel.photo).into(binding.ivUsuario)
        itemView.setOnClickListener {onClickListener(usuarioModel) }
        binding.btnDelete.setOnClickListener {
            onClickDelete(adapterPosition)
        }
    }

}
