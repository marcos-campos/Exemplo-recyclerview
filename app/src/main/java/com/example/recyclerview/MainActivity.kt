package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    
    val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_view) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alunos = getAlunos()

        recycler.layoutManager = LinearLayoutManager(this)

        val adapter = AlunoAdapter(alunos as MutableList<Aluno>, object : InterfaceSelecionarAluno {

            override fun retornaAlunoAndPosicao(aluno: Aluno, position: Int) {
                Toast.makeText(this@MainActivity, "$aluno, position = $position", Toast.LENGTH_LONG)
                        .show()
            }
            
        })

        recycler.adapter = adapter

        val botao = findViewById<Button>(R.id.btn_adicionar_aluno)
        botao.setOnClickListener {
           Toast.makeText(this, "ok", Toast.LENGTH_LONG)
        }
    }

    private fun getAlunos(): List<Aluno> {
        val alunosList = mutableListOf<Aluno>()


        alunosList.add(Aluno("Lux", "1", R.drawable.lux_build))
        alunosList.add(Aluno("Miss Fortune", "2", R.drawable.missfortune_build))
        alunosList.add(Aluno("Sylas", "3", R.drawable.sylas_build))
        alunosList.add(Aluno("Senna", "4", R.drawable.senna_build))
        alunosList.add(Aluno("Urgot", "5", R.drawable.urgot_build))
        alunosList.add(Aluno("Renekton", "6", R.drawable.renekton_build))
        alunosList.add(Aluno("Gnar", "7", R.drawable.gnar_build))
        alunosList.add(Aluno("Leona", "8", R.drawable.leona_build))
        alunosList.add(Aluno("Alistar", "9", R.drawable.alistar_build))
        alunosList.add(Aluno("Yasuo", "10", R.drawable.yasuo_build))
        alunosList.add(Aluno("Aatrox", "11", R.drawable.aatrox_build))
        alunosList.add(Aluno("Oriana", "12", R.drawable.orianna_build))
        return alunosList


//        for (index in 0..30) {
//            val aluno = Aluno("Aluno $index", "Matricula $index")
//            alunosList.add(aluno)
//        }

//        return alunosList.toList()
    }
}
