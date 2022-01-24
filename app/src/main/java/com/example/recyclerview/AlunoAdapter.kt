package com.example.recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class AlunoAdapter(val alunoList: MutableList<Aluno>, val alunoSelecionado: InterfaceSelecionarAluno):
    RecyclerView.Adapter<AlunoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlunoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.aluno_view_holder, parent, false)
        return AlunoViewHolder(view)
    }

    override fun getItemCount() = alunoList.size

    override fun onBindViewHolder(viewHolder: AlunoViewHolder, position: Int) {
        val name = viewHolder.name
        name.text = alunoList[position].nome

        val matricula = viewHolder.matricula
        matricula.text = alunoList[position].matricula

        val imagemOk = viewHolder.imagemDetalhe
        imagemOk.setImageResource(alunoList[position].imagem)

        viewHolder.itemView.setOnClickListener {
            val intent = Intent(it.context, Detalhe::class.java)
            intent.putExtra("NOME", alunoList[position].nome)
            intent.putExtra("MATRICULA", alunoList[position].matricula)
            intent.putExtra("IMAGEM", alunoList[position].imagem)
            it.context.startActivity(intent)


        }
    }

}



