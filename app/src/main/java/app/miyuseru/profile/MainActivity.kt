package app.miyuseru.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        button1.setOnClickListener{
            profileImage.setImageResource(R.drawable.randy_image)
            profileLabelText.text="名前"
            profileCommentText.text="みゆせるだよ"


        }

        button2.setOnClickListener{
            profileImage.setImageResource(R.drawable.baseball_image)
            profileLabelText.text="本当は卓球が好き"
            profileCommentText.text = "小４からやってたよ"

        }

        button3.setOnClickListener{
            profileImage.setImageResource(R.drawable.donut_image)
            profileLabelText.text="donut"
            profileCommentText.text = "ドーナッっっつ"

        }
        button4.setOnClickListener{
            profileImage.setImageResource(R.drawable.gadget_image
            )
            profileLabelText.text="ガジェと"
            profileCommentText.text = "ガジェット系が好きらしい"

        }
    }
}
