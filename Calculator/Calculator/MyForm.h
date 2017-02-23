#pragma once

namespace Calculator {

	using namespace System;
	using namespace System::ComponentModel;
	using namespace System::Collections;
	using namespace System::Windows::Forms;
	using namespace System::Data;
	using namespace System::Drawing;

	/// <summary>
	/// Summary for MyForm
	/// </summary>
	public ref class MyForm : public System::Windows::Forms::Form
	{
	public:
		MyForm(void)
		{
			InitializeComponent();
			//
			//TODO: Add the constructor code here
			//
		}

	protected:
		/// <summary>
		/// Clean up any resources being used.
		/// </summary>
		~MyForm()
		{
			if (components)
			{
				delete components;
			}
		}
	private: System::Windows::Forms::Label^  calcOut;
	private: System::Windows::Forms::Button^  one;
	private: System::Windows::Forms::Button^  two;
	private: System::Windows::Forms::Button^  three;
	private: System::Windows::Forms::Button^  plus;
	private: System::Windows::Forms::Button^  four;
	private: System::Windows::Forms::Button^  five;
	private: System::Windows::Forms::Button^  six;
	private: System::Windows::Forms::Button^  minus;
	private: System::Windows::Forms::Button^  seven;
	private: System::Windows::Forms::Button^  eight;
	private: System::Windows::Forms::Button^  nine;
	private: System::Windows::Forms::Button^  dividedBy;
	private: System::Windows::Forms::Button^  clear;

	private: System::Windows::Forms::Button^  multipliedBy;
	private: System::Windows::Forms::Button^  equals;
	private: System::Windows::Forms::Button^  zero;

	protected:

	protected:

	protected:

	private:
		/// <summary>
		/// Required designer variable.
		/// </summary>
		System::ComponentModel::Container ^components;

#pragma region Windows Form Designer generated code
		/// <summary>
		/// Required method for Designer support - do not modify
		/// the contents of this method with the code editor.
		/// </summary>
		void InitializeComponent(void)
		{
			this->calcOut = (gcnew System::Windows::Forms::Label());
			this->one = (gcnew System::Windows::Forms::Button());
			this->two = (gcnew System::Windows::Forms::Button());
			this->three = (gcnew System::Windows::Forms::Button());
			this->plus = (gcnew System::Windows::Forms::Button());
			this->four = (gcnew System::Windows::Forms::Button());
			this->five = (gcnew System::Windows::Forms::Button());
			this->six = (gcnew System::Windows::Forms::Button());
			this->minus = (gcnew System::Windows::Forms::Button());
			this->seven = (gcnew System::Windows::Forms::Button());
			this->eight = (gcnew System::Windows::Forms::Button());
			this->nine = (gcnew System::Windows::Forms::Button());
			this->dividedBy = (gcnew System::Windows::Forms::Button());
			this->clear = (gcnew System::Windows::Forms::Button());
			this->multipliedBy = (gcnew System::Windows::Forms::Button());
			this->equals = (gcnew System::Windows::Forms::Button());
			this->zero = (gcnew System::Windows::Forms::Button());
			this->SuspendLayout();
			// 
			// calcOut
			// 
			this->calcOut->AccessibleDescription = L"Output for the calculator";
			this->calcOut->AccessibleName = L"calcOut";
			this->calcOut->BackColor = System::Drawing::Color::White;
			this->calcOut->BorderStyle = System::Windows::Forms::BorderStyle::Fixed3D;
			this->calcOut->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 27.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->calcOut->Location = System::Drawing::Point(8, 7);
			this->calcOut->Name = L"calcOut";
			this->calcOut->Size = System::Drawing::Size(218, 46);
			this->calcOut->TabIndex = 0;
			this->calcOut->Text = L"0";
			this->calcOut->TextAlign = System::Drawing::ContentAlignment::MiddleRight;
			// 
			// one
			// 
			this->one->AccessibleName = L"one";
			this->one->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->one->Location = System::Drawing::Point(8, 64);
			this->one->Name = L"one";
			this->one->Size = System::Drawing::Size(50, 50);
			this->one->TabIndex = 1;
			this->one->Text = L"1";
			this->one->UseVisualStyleBackColor = true;
			// 
			// two
			// 
			this->two->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->two->Location = System::Drawing::Point(64, 64);
			this->two->Name = L"two";
			this->two->Size = System::Drawing::Size(50, 50);
			this->two->TabIndex = 2;
			this->two->Text = L"2";
			this->two->UseVisualStyleBackColor = true;
			// 
			// three
			// 
			this->three->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->three->Location = System::Drawing::Point(120, 64);
			this->three->Name = L"three";
			this->three->Size = System::Drawing::Size(50, 50);
			this->three->TabIndex = 3;
			this->three->Text = L"3";
			this->three->UseVisualStyleBackColor = true;
			// 
			// plus
			// 
			this->plus->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->plus->Location = System::Drawing::Point(176, 64);
			this->plus->Name = L"plus";
			this->plus->Size = System::Drawing::Size(50, 50);
			this->plus->TabIndex = 4;
			this->plus->Text = L"+";
			this->plus->UseVisualStyleBackColor = true;
			// 
			// four
			// 
			this->four->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->four->Location = System::Drawing::Point(8, 120);
			this->four->Name = L"four";
			this->four->Size = System::Drawing::Size(50, 50);
			this->four->TabIndex = 5;
			this->four->Text = L"4";
			this->four->UseVisualStyleBackColor = true;
			// 
			// five
			// 
			this->five->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->five->Location = System::Drawing::Point(64, 120);
			this->five->Name = L"five";
			this->five->Size = System::Drawing::Size(50, 50);
			this->five->TabIndex = 6;
			this->five->Text = L"5";
			this->five->UseVisualStyleBackColor = true;
			// 
			// six
			// 
			this->six->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->six->Location = System::Drawing::Point(120, 120);
			this->six->Name = L"six";
			this->six->Size = System::Drawing::Size(50, 50);
			this->six->TabIndex = 7;
			this->six->Text = L"6";
			this->six->UseVisualStyleBackColor = true;
			// 
			// minus
			// 
			this->minus->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->minus->Location = System::Drawing::Point(176, 120);
			this->minus->Name = L"minus";
			this->minus->Size = System::Drawing::Size(50, 50);
			this->minus->TabIndex = 8;
			this->minus->Text = L"-";
			this->minus->UseVisualStyleBackColor = true;
			// 
			// seven
			// 
			this->seven->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->seven->Location = System::Drawing::Point(8, 176);
			this->seven->Name = L"seven";
			this->seven->Size = System::Drawing::Size(50, 50);
			this->seven->TabIndex = 9;
			this->seven->Text = L"7";
			this->seven->UseVisualStyleBackColor = true;
			// 
			// eight
			// 
			this->eight->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->eight->Location = System::Drawing::Point(64, 176);
			this->eight->Name = L"eight";
			this->eight->Size = System::Drawing::Size(50, 50);
			this->eight->TabIndex = 10;
			this->eight->Text = L"8";
			this->eight->UseVisualStyleBackColor = true;
			// 
			// nine
			// 
			this->nine->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->nine->Location = System::Drawing::Point(120, 176);
			this->nine->Name = L"nine";
			this->nine->Size = System::Drawing::Size(50, 50);
			this->nine->TabIndex = 11;
			this->nine->Text = L"9";
			this->nine->UseVisualStyleBackColor = true;
			// 
			// dividedBy
			// 
			this->dividedBy->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->dividedBy->Location = System::Drawing::Point(176, 176);
			this->dividedBy->Name = L"dividedBy";
			this->dividedBy->Size = System::Drawing::Size(50, 50);
			this->dividedBy->TabIndex = 12;
			this->dividedBy->Text = L"/";
			this->dividedBy->UseVisualStyleBackColor = true;
			// 
			// clear
			// 
			this->clear->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->clear->Location = System::Drawing::Point(8, 232);
			this->clear->Name = L"clear";
			this->clear->Size = System::Drawing::Size(50, 50);
			this->clear->TabIndex = 13;
			this->clear->Text = L"C";
			this->clear->UseVisualStyleBackColor = true;
			this->clear->Click += gcnew System::EventHandler(this, &MyForm::zero_Click);
			// 
			// multipliedBy
			// 
			this->multipliedBy->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->multipliedBy->Location = System::Drawing::Point(176, 232);
			this->multipliedBy->Name = L"multipliedBy";
			this->multipliedBy->Size = System::Drawing::Size(50, 50);
			this->multipliedBy->TabIndex = 14;
			this->multipliedBy->Text = L"x";
			this->multipliedBy->UseVisualStyleBackColor = true;
			// 
			// equals
			// 
			this->equals->Font = (gcnew System::Drawing::Font(L"Monotype Corsiva", 15.75F, System::Drawing::FontStyle::Italic, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->equals->Location = System::Drawing::Point(120, 232);
			this->equals->Name = L"equals";
			this->equals->Size = System::Drawing::Size(50, 50);
			this->equals->TabIndex = 15;
			this->equals->Text = L"=";
			this->equals->UseVisualStyleBackColor = true;
			// 
			// zero
			// 
			this->zero->Font = (gcnew System::Drawing::Font(L"Modern No. 20", 15.75F, System::Drawing::FontStyle::Regular, System::Drawing::GraphicsUnit::Point,
				static_cast<System::Byte>(0)));
			this->zero->Location = System::Drawing::Point(64, 232);
			this->zero->Name = L"zero";
			this->zero->Size = System::Drawing::Size(50, 50);
			this->zero->TabIndex = 16;
			this->zero->Text = L"0";
			this->zero->UseVisualStyleBackColor = true;
			// 
			// MyForm
			// 
			this->AutoScaleDimensions = System::Drawing::SizeF(6, 13);
			this->AutoScaleMode = System::Windows::Forms::AutoScaleMode::Font;
			this->BackColor = System::Drawing::Color::Aquamarine;
			this->ClientSize = System::Drawing::Size(234, 296);
			this->Controls->Add(this->zero);
			this->Controls->Add(this->equals);
			this->Controls->Add(this->multipliedBy);
			this->Controls->Add(this->clear);
			this->Controls->Add(this->dividedBy);
			this->Controls->Add(this->nine);
			this->Controls->Add(this->eight);
			this->Controls->Add(this->seven);
			this->Controls->Add(this->minus);
			this->Controls->Add(this->six);
			this->Controls->Add(this->five);
			this->Controls->Add(this->four);
			this->Controls->Add(this->plus);
			this->Controls->Add(this->three);
			this->Controls->Add(this->two);
			this->Controls->Add(this->one);
			this->Controls->Add(this->calcOut);
			this->FormBorderStyle = System::Windows::Forms::FormBorderStyle::Fixed3D;
			this->Name = L"MyForm";
			this->Text = L"Calculator";
			this->ResumeLayout(false);

		}

		int first;
		int second;
		int result;
		char operation;

#pragma endregion
	private: System::Void one_Click(System::Object^  sender, System::EventArgs^  e) {

		if (calcOut->Text == "0"){
			calcOut->Text = "1";
		}	else{
			calcOut->Text = Convert::ToInt32(calcOut->Text) + "1";
		}

	}
};
}
