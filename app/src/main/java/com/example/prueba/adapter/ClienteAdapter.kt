package com.example.prueba_consumo.adapter
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.prueba.Cliente
//import com.example.prueba.R
//import com.example.prueba_consumo.R
//import com.example.prueba_consumo.entity.Cliente
//
//class ClienteAdapter(private var listacliente : List<Cliente>)
//    : RecyclerView.Adapter<ClienteAdapter.ViewHolder>(){
//        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//            val tvcodDni : TextView = itemView.findViewById(R.id.tvcodClienteDni)
//            val tvnombre : TextView = itemView.findViewById(R.id.tvnombre)
//            val tvdni : TextView = itemView.findViewById(R.id.tvdni)
//            val tvapellido_pate : TextView = itemView.findViewById(R.id.tvapellido_pate)
//            val tvapellido_mate : TextView = itemView.findViewById(R.id.tvapellido_mate)
//            val tvfecha_naci : TextView = itemView.findViewById(R.id.tvfecha_naci)
//            val tvfecha_afiliacion : TextView = itemView.findViewById(R.id.tvfecha_afiliacion)
//            val tvcorreo_elec : TextView = itemView.findViewById(R.id.tvcorreo_elec)
//            val tvcelular : TextView = itemView.findViewById(R.id.tvcelular)
//            val tvdepartamento : TextView = itemView.findViewById(R.id.tvdepartamento)
//            val tvprovincia : TextView = itemView.findViewById(R.id.tvprovincia)
//            val tvdistrito : TextView = itemView.findViewById(R.id.tvdistrito)
//            val tvdireccion : TextView = itemView.findViewById(R.id.tvdireccion)
//            val tvestado_civil : TextView = itemView.findViewById(R.id.tvestado_civil)
//            val tvocupacion : TextView = itemView.findViewById(R.id.tvocupacion)
//
//        }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val layoutInflater = LayoutInflater
//            .from(parent.context)
//        return ViewHolder(
//            layoutInflater.inflate(
//                R.layout.client_item,
//                parent,false
//            )
//        )
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val item = listacliente[position]
//        holder.tvcodDni.text = item.codClienteDni.toString()
//        holder.tvdni.text = item.dni
//        holder.tvnombre.text = item.nombre
//        holder.tvapellido_pate.text = item.apellidoPate
//        holder.tvapellido_mate.text = item.apellidoMate
//        holder.tvfecha_naci.text = item.fechaNaci
//        holder.tvfecha_afiliacion.text = item.fechaAfiliacion
//        holder.tvcorreo_elec.text = item.correoElec
//        holder.tvcelular.text = item.celular.toString()
//        holder.tvdepartamento.text = item.departamento
//        holder.tvprovincia.text = item.provincia
//        holder.tvdistrito.text = item.distrito
//        holder.tvdireccion.text = item.direccion
//        holder.tvestado_civil.text = item.estadoCivil
//        holder.tvocupacion.text = item.ocupacion
//    }
//
//    override fun getItemCount(): Int {
//        return listacliente.size
//    }
//
//}