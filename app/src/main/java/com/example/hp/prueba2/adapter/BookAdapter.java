package com.example.hp.prueba2.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.hp.prueba2.Model.Book;
import com.example.hp.prueba2.R;

import java.util.List;

/**
 * Created by HP on 26-08-2017.
 */

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {

    private Book[] listBooks;
    private Context mContext;

    public BookAdapter(Context context, List<Book> books)
    {
        mContext = context;
        listBooks = books.toArray(new Book[books.size()]);
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_book, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Book book = listBooks[position];
        holder.autor.setText(book.getAutor());
        holder.titulo.setText(book.getTitulo());
        holder.comentario.setText(book.getComentario());
        holder.autor.setText(book.getAutor());
        holder.porcentaje.setText(String.valueOf(book.getPorcentaje()));
        LinearLayout name = holder.row;
        int clickPosition = holder.getAdapterPosition();
        //Long getBookId = listBooks.get(clickPosition).getId();
        /*name.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
          //      holder.row.setBackgroundResource(color.colorTextGray);

                int clickPosition = holder.getAdapterPosition();
                Long getBookId = listBooks.get(clickPosition).getId();

                listBooks.remove(clickPosition);
                notifyItemRemoved(clickPosition);
               // clickListener.removeBook(getGiftId);
                return true;
            }

        });

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //    holder.row.setBackgroundResource(color.colorTextGray);
                int clickPosition = holder.getAdapterPosition();
                Long getBookId = listBooks.get(clickPosition).getId();
                clickListener.clickContent(getBookId);
            }
        });
*/
        //Book bookItem = Book.findById(Book.class, getBookId);
      //  if(bookItem.isBought() == true){
        //    holder.row.setBackgroundResource(drawable.bg_green_underline_white);
        //}

    }

    @Override
    public int getItemCount() {
        return listBooks.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView autor,titulo,comentario,porcentaje;
        private LinearLayout row;
        public ViewHolder(View itemView) {
            super(itemView);
            autor = (TextView) itemView.findViewById(R.id.autorTextView);
            titulo = (TextView) itemView.findViewById(R.id.tituloTextView);
            comentario = (TextView) itemView.findViewById(R.id.comentarioTextView);
            porcentaje = itemView.findViewById(R.id.porcentajeTv);
            row = (LinearLayout) itemView;
            itemView.setOnClickListener((View.OnClickListener) this);
        }
    }

}
