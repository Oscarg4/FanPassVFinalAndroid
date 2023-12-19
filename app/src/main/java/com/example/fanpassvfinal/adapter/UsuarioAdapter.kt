package com.example.fanpassvfinal.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fanpassvfinal.R
import com.example.fanpassvfinal.Usuario

class UsuarioAdapter(
    private val usuarioList: List<Usuario>,
    private val onClickListener: (Usuario) -> Unit = {},
    private val onClickDelete: (Int) -> Unit = {}
) : RecyclerView.Adapter<UsuarioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return UsuarioViewHolder(layoutInflater.inflate(R.layout.item_usuario, parent, false))
    }

    override fun getItemCount(): Int = usuarioList.size

    override fun onBindViewHolder(holder: UsuarioViewHolder, position: Int) {
        val item = usuarioList[position]
        holder.render(item, onClickListener, onClickDelete)
    }
}
