{\rtf1\ansi\ansicpg1252\cocoartf2818
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.Scanner;\
public class Watermelon\{\
    public static void main(String[] args)\{\
        Scanner sc = new Scanner(System.in);\
        int w = sc.nextInt();\
        if(w > 2 && w%2 == 0)\{\
            System.out.println("YES");\
        \}\
        else\{\
            System.out.println("NO");\
        \}\
    \}\
\}}