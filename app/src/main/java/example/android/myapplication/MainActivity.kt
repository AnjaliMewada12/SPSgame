package example.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rock:Button=findViewById(R.id.rock)
        rock.setOnClickListener(){rock()}
        val paper:Button=findViewById(R.id.paper)
        paper.setOnClickListener(){paper()}
        val scissor:Button=findViewById(R.id.scissor)
        scissor.setOnClickListener(){scissor()}
        val restart:Button=findViewById(R.id.restart)
        restart.setOnClickListener(){restart()}
    }
    private fun rock(){
        val comp=(1..3).random()
        val im=when(comp){
            1->R.drawable.com_paper
            2->R.drawable.com_rock
            else->R.drawable.com_scissor
        }
        val com:ImageView=findViewById(R.id.com)
        com.setImageResource(im)
        val me:ImageView=findViewById(R.id.me)
        me.setImageResource(R.drawable.me_rock)
        val result:TextView=findViewById(R.id.result)
        if(comp==1){
            result.text="you lost"
        }
        else if(comp==2){
            result.text="tie"
        }
        else{
            result.text="you won"
        }
    }
    private fun paper(){
        val comp=(1..3).random()
        val im=when(comp){
            1->R.drawable.com_paper
            2->R.drawable.com_rock
            else->R.drawable.com_scissor
        }
        val com:ImageView=findViewById(R.id.com)
        com.setImageResource(im)
        val me:ImageView=findViewById(R.id.me)
        me.setImageResource(R.drawable.me_paper)
        val result:TextView=findViewById(R.id.result)
        if(comp==1){
            result.text="tie"
        }
        else if(comp==2){
            result.text="you won"
        }
        else{
            result.text="you lost"
        }
    }
    private fun scissor(){
        val comp=(1..3).random()
        val im=when(comp){
            1->R.drawable.com_paper
            2->R.drawable.com_rock
            else->R.drawable.com_scissor
        }
        val com:ImageView=findViewById(R.id.com)
        com.setImageResource(im)
        val me:ImageView=findViewById(R.id.me)
        me.setImageResource(R.drawable.me_scissor)
        val result:TextView=findViewById(R.id.result)
        if(comp==1){
            result.text="you won"
        }
        else if(comp==2){
            result.text="you lost"
        }
        else{
            result.text="tie"
        }
    }
    private fun restart(){
        val result:TextView=findViewById(R.id.result)
        result.text=""
        val com:ImageView=findViewById(R.id.com)
        com.setImageResource(R.drawable.empty_dice)
        val me:ImageView=findViewById(R.id.me)
        me.setImageResource(R.drawable.empty_dice)
    }
}
