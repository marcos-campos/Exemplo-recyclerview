package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar

class Detalhe : AppCompatActivity() {

    val toolbar by lazy { findViewById<Toolbar>(R.id.toolbar_alunos) }
    val nomeAlunoTxt by lazy { findViewById<TextView>(R.id.txt_name_aluno) }
    val matriculaAlunoTxt by lazy { findViewById<TextView>(R.id.txt_matricula_aluno) }
    val imagemView by lazy { findViewById<ImageView>(R.id.img_ok) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detalhe)

        val informacoes = intent.extras

        if (informacoes != null){

            val nomeAluno = informacoes.getString("NOME")
            val matriculaAluno = informacoes.getString("MATRICULA")
            val imagem = informacoes.getInt("IMAGEM")
            val alunoRecebido = Aluno(nomeAluno, matriculaAluno, imagem)

            nomeAlunoTxt.text = alunoRecebido.nome
            matriculaAlunoTxt.text = alunoRecebido.matricula
            imagemView.setImageResource(imagem)

        }else{

            Toast.makeText(this, "Erro ao carregar aluno", Toast.LENGTH_LONG).show()

        }


    }
}