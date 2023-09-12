package jp.hana897trx.animeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import domain.TestClassOrIdk
import jp.hana897trx.animeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    fun aRandomTest(){
        val resultFromDataTroughDomain = TestClassOrIdk().test("Hola")
        // log del result abr sicierto
    }
}